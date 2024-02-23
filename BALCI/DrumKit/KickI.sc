KickI {

	classvar <>server;
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

		~kick1 =  Pbindef(\kick1).fadeTime_(1);

		 fork{
			 ~metronomos = TempoClock(1); // create a TempoClock

// schedule an event at next whole beat
			 	~metronomos.schedAbs(~metronomos.beats.ceil, { arg beat, sec; [beat, sec]; 1 });



			 ~metronomos.tempo = 1;
			"~metronomos->t.tempo = 1".postln;


			 ~kick1 = Pbindef(\kick1, \buf, ~bufs[0]);



			 			~kick1 =Pbindef(\kick1, \freq, 120, \dur, Pseq([0.5, 0.5, 0.5, 0.5], inf), \amp, 0.0000001,/* Prand([0.4, 0.3, 0.5, 0.36], inf),*/ \char, "kick_char".postln);//.play(metronomos, quant: 4);



		 	 ~kick1 = Pbindef(\kick1, \instrument, \bf, \out, ~mbus1).play(~metronomos, quant: 4);


			

};

		"Pbindef(\\kick1) -> args: \\freq, \\dur, \\amp, \\pan...Filter Ndef(\\d1)".postln;
	}

}