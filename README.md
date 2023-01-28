# mc_migration_tool_resources_generator_geyser

```shell
# curl -o "libs/core-2.1.0-SNAPSHOT.jar" "https://repo.opencollab.dev/artifactory/maven-snapshots/org/geysermc/geyser/core/2.1.0-SNAPSHOT/core-2.1.0-SNAPSHOT.jar"
curl -o "libs/core-2.1.0-SNAPSHOT.jar" "https://repo.opencollab.dev/maven-snapshots/org/geysermc/geyser/core/2.1.0-SNAPSHOT/core-2.1.0-20230125.161104-87.jar"

javac -cp ".;libs/core-2.1.0-SNAPSHOT.jar" Main.java
java -cp ".;libs/core-2.1.0-SNAPSHOT.jar" Main
```
