SpringLeadI{

	classvar <>server;
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

	 Pbindef(\harpy01).fadeTime_(1);
	~f = fork{

			~metronomos = TempoClock(1); // create a TempoClock

// schedule an event at next whole beat
			~metronomos.schedAbs(~metronomos.beats.ceil, { arg beat, sec; [beat, sec]; 1 });

			~metronomos.tempo = 1;

			~metronomos.tempo.postln;

 Pbindef(\harpy01, \buf, ~bufs3[0]);
0.1.wait;

Pbindef(\harpy01, \freq, 620, \dur, Pseq([0.5, 0.5, 0.5, 0.5], inf), \amp, Prand([0.4, 0.3, 0.5, 0.36], inf));

		//~t = TempoClock(4/4);

0.5.wait;

 Pbindef(\harpy01, \instrument, \bf2, \out, ~mbus18).play(~metronomos, quant: 4);

};

		"Pbindef(\\harpy01) -> args: \\freq, \\dur, \\amp, \\pan".postln;
	}

}