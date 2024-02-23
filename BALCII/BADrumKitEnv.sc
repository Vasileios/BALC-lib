// =====================================================================
// SuperCollider Workspace - VA2024
// BADrumKit version II
// =====================================================================

BADrumKitEnv{



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


BASynthBeatII();  DrumKitEnvEval();


	}

}