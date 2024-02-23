BassI{

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

	~bass1 = Pbindef(\bass).fadeTime_(1);
		~f = fork{
						~metronomos = TempoClock(1); // create a TempoClock

// schedule an event at next whole beat
			~metronomos.schedAbs(~metronomos.beats.ceil, { arg beat, sec; [beat, sec]; 1 });

			~metronomos.tempo = 1;

			~metronomos.tempo.postln;
			"~metronomos->t.tempo = 1".postln;
//0.5.wait;
			~bass1 = Pbindef(\bass, \instrument, \bf, \out, ~mbus9).play(~metronomos, quant: 4);

 ~bass1 = Pbindef(\bass, \buf, ~bufs2[0]);
//0.1.wait;

~bass1 = Pbindef(\bass, \dur, Pseq([0.25, 0.5, 0, 0.5], inf), \amp, 0.0000001);

		//~t = TempoClock(4/4);

//0.5.wait;
//server.sync;


	};

		"Pbindef(\\bass) -> args: \\freq, \\dur, \\amp, \\pan".postcln;
		//name = n;
	}

}