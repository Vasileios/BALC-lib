VoiceI{

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

~voice1 = Pbindef(\voice1).fadeTime_(1);
	~f = fork{

			~metronomos = TempoClock(1); // create a TempoClock

// schedule an event at next whole beat
			~metronomos.schedAbs(~metronomos.beats.ceil, { arg beat, sec; [beat, sec]; 1 });

			~metronomos.tempo = 1;

			~metronomos.tempo.postln;

 ~voice1 = Pbindef(\voice1, \buf, ~bufs4[0]);
0.1.wait;

~voice1 = Pbindef(\voice1, \freq, 620, \dur, Pseq([0.5, 0.5, 0.5, 0.5], inf), \amp, 0.000001/*Prand([0.4, 0.3, 0.5, 0.36], inf)*/);

		//~t = TempoClock(4/4);

0.5.wait;

~voice1 = Pbindef(\voice1, \instrument, \bf, \out, ~mbus13).play(~metronomos, quant: 4);

};

		"Pbindef(\\voice1) -> args: \\freq, \\dur, \\amp, \\pan".postln;
	}

}