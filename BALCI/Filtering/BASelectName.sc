// =====================================================================
// SuperCollider Workspace - VA2016
// BASynths version I
// =====================================================================
BASelectName {

		classvar <>metronomos;
	classvar <>server;
	//select Pbindef instrument by name and set argumetns of the synth

	*instrument{|name, freq = 666, duration = 0.5, amp = 0.7, shape = 0.05, pan = 0, buf|


		^Pbindef(name, \freq, freq, \shape, shape, \dur, duration, \amp, amp, \pan, pan, \buf, buf).play(~metronomos, quant:4);
	}

	*filter{|name, filternum = 1, filter = nil, in, f1, f2, f3|


		^Ndef(name);


	}



}