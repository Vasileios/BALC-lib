# BALiveCodingEnv

Live Coding Environment

Put BALC lib into your SuperCollider Extensions folder and recompile class library

To run the lib in superCollider do the following:

//run first the synths environment

====================================================Synths==============================================================


BASynthGens();

//====================================================Track1==============================================================

//fm

//manipulate sound

~fm = Pbindef(\fm, \freq, Prand([200, 2333, 122, 13.3], inf), \modfreq, Prand([200, 2333, 122, 13.3], inf), \ind, Prand([200, 2333, 122, 13.3], inf), \vol, 0.4, \fade, 2, \dur, 2,  \amp, 0.6, \pan, Prand((-1..1), inf)).play;


//then run the drum Kit environment

BADrumKitEnv();

//checking buffers

MyEnvir.bufs[0];

====================================================DrumKit==============================================================

MyEnvir.metronomos.tempo_(1)//Set up metronome

//====================================================Track1==============================================================

//manipulate sound

//Snare

~snare1 = Pbindef(\snare, \freq,60, \dur, 0.5, \amp, 1, \vol, 1,\shape,1,\buf, MyEnvir.bufs[3].postln, \pan, 0.4).play;

Do the same with other instruments:

~kick1 = Pbindef(\kick1, ...).play

~kick2 = Pbindef(\kick2, ...).play

~hihat1 = Pbindef(\hihat1, ...).play

~hihat2 = Pbindef(\hihat2, ...).play

...etc.


# Have Fun!!


