// =====================================================================
// SuperCollider Workspace - VA2016
// BASynths version I
// =====================================================================
HihatI {

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



		^obj;
	}

	init{ arg n;


	~hihat1 =  Pbindef(\hihat1).fadeTime_(1);
		~f = fork{

			~metronomos = TempoClock(1); // create a TempoClock

// schedule an event at next whole beat
			~metronomos.schedAbs(~metronomos.beats.ceil, { arg beat, sec; [beat, sec]; 1 });

			~metronomos.tempo = 1;

			~metronomos.tempo.postln;
			"~metronomos->t.tempo = 1".postln;

			~hihat1  =Pbindef(\hihat1, \buf, ~bufs[4]);
			0.1.wait;

~hihat1 =Pbindef(\hihat1, \freq, 630, \dur, Pseq([0.25, 0.25, 0.25, 0.25], inf), \amp, 0.0 );

			0.5.wait;

			~hihat1 = Pbindef(\hihat1, \instrument, \bf, \out, ~mbus5).play(~metronomos, quant: 4);

		};

		"Pbindef(\\hihat1) -> args: \\freq, \\dur, \\amp, \\pan ...Filter Ndef(\\d5)".postln;
	}

}