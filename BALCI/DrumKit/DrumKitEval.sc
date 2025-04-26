// =====================================================================
// SuperCollider Workspace - VA2016
// BASynths version I
// =====================================================================
DrumKitEval{



 	classvar <>server;
	var name;



	// Constructor

	*new{
		arg n;
		var obj;


		server = Server.local;
		obj = super.new;

		obj.init(n);



		^obj;
	}

	init{ arg n;




fork{
2.wait;
			0.1.wait;
			KickI();
			KickII();
			SnareI();
			//SnareII();
			HihatI();
			HihatII();
			BassI();
			PadI();
			VoiceI();
			VoiceII();



	0.5.wait;

	~syncDrums  = Ppar([~kick1,~kick2,~snare1, ~snare2, ~hihat1, ~hihat2, ~bass1, ~pad1, ~voice1, ~voice2]);


	0.1.wait;
	~syncDrums;
//server.sync;
};
	}


}