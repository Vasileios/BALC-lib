BASelectName {

		classvar <>metronomos;
	classvar <>server;
	//select Pbindef instrument by name and set argumetns of the synth

	*instrument{|name, freq = 666, duration = 0.5, amp = 0.7, shape = 0.05, pan = 0, buf|
		//tempo.tempo = 1;


		//	metronomos = TempoClock(1); // create a TempoClock

// schedule an event at next whole beat
//	metronomos.schedAbs(metronomos.beats.ceil, { arg beat, sec; [beat, sec]; 1 });
//server.sync;
		//	metronomos.tempo = 1;

		//	metronomos.tempo.postln;
		//	"metronomos->t.tempo = 1".postln;

		^Pbindef(name, \freq, freq, \shape, shape, \dur, duration, \amp, amp, \pan, pan, \buf, buf).play(~metronomos, quant:4);//.fadeTime_(1);

	}

	*filter{|name, filternum = 1, filter = nil, in, f1, f2, f3|


		^Ndef(name);
		//.put(filternum, filter);


	}



}