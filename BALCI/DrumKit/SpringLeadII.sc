SpringLeadII{

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

	 Pbindef(\harpy02).fadeTime_(1);
	~f = fork{
 Pbindef(\harpy02, \buf, ~bufs2[1]);
0.1.wait;

Pbindef(\harpy02, \freq, 620, \dur, Pseq([0.5, 0.5, 0.5, 0.5], inf), \amp, Prand([0.4, 0.3, 0.5, 0.36], inf));

		//~t = TempoClock(4/4);

0.5.wait;

 Pbindef(\harpy02, \instrument, \bf2, \out, ~mbus19).play(~t, quant: 4);

};

		"Pbindef(\\harpy02) -> args: \\freq, \\dur, \\amp, \\pan".postln;
	}
	
}