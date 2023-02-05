# mc_migration_tool_resources_generator_geyser

## Development

### Build

```shell
./gradlew build
```

Distribute these files.

- `build/distributions/mc_migration_tool_resources_generator_geyser.zip`
- `build/distributions/mc_migration_tool_resources_generator_geyser.tar`

### Check code

- [Error Prone](https://github.com/google/error-prone) / [tbroyer/gradle-errorprone-plugin](https://github.com/tbroyer/gradle-errorprone-plugin)
- [SpotBugs](https://github.com/spotbugs/spotbugs) + [mebigfatguy/fb-contrib](https://github.com/mebigfatguy/fb-contrib)

```shell
./gradlew check
```

### Run

```shell
./gradlew run --args="-t enchantments -o resources/enchantments.csv"
```
