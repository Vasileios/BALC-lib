KickII {

	classvar <>server;
	//classvar <>metronomos;
	var name;

	//Constructor

	*new{
		arg n;
		var obj;

		server = Server.local;
		obj = super.new;

		obj.init(n);

		//obj.initPattern;

		^obj;
	}

	init{ arg n;

~kick2 =  Pbindef(\kick2).fadeTime_(1);
		~f = fork{
			/*					~t = TempoClock(1); // create a TempoClock

// schedule an event at next whole beat
~t.schedAbs(~t.beats.ceil, { arg beat, sec; [beat, sec]; 1 });

			~t.tempo = 1;

			~t.tempo.postln;
			"~t -> ~t.tempo = 1".postln;


			//~kick2 =Pbindef(\kick2, \buf, ~bufs[1]);
				*/
			~metronomos = TempoClock(1); // create a TempoClock

// schedule an event at next whole beat
			~metronomos.schedAbs(~metronomos.beats.ceil, { arg beat, sec; [beat, sec]; 1 });

			~metronomos.tempo = 1;

			~metronomos.tempo.postln;
			//"~metronomos->t.tempo = 1".postln;
/*metronomos = TempoClock(1);
			metronomos.schedAbs(metronomos.beats.ceil, { arg beat, sec; [beat, sec]; 1 });

			metronomos.tempo = 1;

			metronomos.tempo.postln;
			"metronomos->t.tempo = 1".postln;
*/
			~kick2 = Pbindef(\kick2, \buf, ~bufs[1]);
			0.1.wait;
~kick2 =Pbindef(\kick2, \dur, Pseq([0.25, 0.5, 0.5, 0,5], inf), \amp, 0.0000001);//.play(metronomos, quant: 4);

		//~t = TempoClock(4/4);

			0.5.wait;

			~kick2 = Pbindef(\kick2, \instrument, \bf, \out, ~mbus2).play(~metronomos, quant: 4);//or out 0//

	};


		"Pbindef(\\kick2) -> args: \\freq, \\dur, \\amp, \\pan".postln;

	}

}