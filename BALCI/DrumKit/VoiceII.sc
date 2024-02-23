VoiceII{

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

~voice2 = Pbindef(\voice2).fadeTime_(1);
	~f = fork{

			~metronomos = TempoClock(1); // create a TempoClock

// schedule an event at next whole beat
			~metronomos.schedAbs(~metronomos.beats.ceil, { arg beat, sec; [beat, sec]; 1 });

			~metronomos.tempo = 1;

			~metronomos.tempo.postln;

 ~voice2 = Pbindef(\voice2, \buf, ~bufs4[2]);
0.1.wait;

~voice2 = Pbindef(\voice2, \freq, 620, \dur, Pseq([0.5, 0.5, 0.5, 0.5], inf), \amp, 0.000001/*Prand([0.4, 0.3, 0.5, 0.36], inf)*/);

		//~t = TempoClock(4/4);

0.5.wait;

~voice2 = Pbindef(\voice2, \instrument, \bf, \out, ~mbus14).play(~metronomos, quant: 4);

};

		"Pbindef(\\voice3) -> args: \\freq, \\dur, \\amp, \\pan".postln;
	}

}