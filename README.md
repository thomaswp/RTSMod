Setup
-----
* Run setup1.bat
* Wait
* Run setup2.bat
* Wait some more (get snack)
* Copy the eclipse folder into another directory (not in this folder)
* Start Eclipse and set the eclipse folder as your workspace
* Go File->Import->Existing Projects into Workspace and select this folder as the root directory. Click through to the end of the wizard
* Go Run->Run As, select Java Application and select GradleStart (or GradleStartServer) as the main class
* It may fail. If so then go to Run->Run Configurations... and edit the GradleStart item. Under the Arguments tab, Program arguments add:
    --assetIndex 1.7.10 --assetsDir ${env_var:USERPROFILE}/.gradle/caches/minecraft/assets
* Run
