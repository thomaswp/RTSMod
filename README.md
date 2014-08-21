Setup
-----
* Run setup.bat
* Wait (get snack)
* Create an eclipse workspace somewhere other than this folder
* Go File->Import->Existing Projects into Workspace and select this folder as the root directory. Click through to the end of the wizard
* Go Run->Run As, select Java Application and select net.minecraft.launchwrapper as the main class
* It will fail. Then go to Run->Run Configurations... and edit the Main item. Under the Arguments tab, add:

Program Arguments:

    --version 1.6 --tweakClass cpw.mods.fml.common.launcher.FMLTweaker --accessToken FML
VM arguments:

	-Dfml.ignoreInvalidMinecraftCertificates=true

* Run
* If it fails with a lwjgl error let me know - you may need to rerun the eclipse project setup
