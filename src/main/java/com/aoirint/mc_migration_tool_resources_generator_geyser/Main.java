package com.aoirint.mc_migration_tool_resources_generator_geyser;

import java.util.Locale;
import org.geysermc.geyser.inventory.item.Enchantment;

public class Main {
  public static void main(String[] argv) {
    System.out.printf("bedrock_numeric_identifier,java_string_identifier,java_numeric_identifier\r\n");
    for (final var bedrockEnchantment: Enchantment.values()) {
      final var bedrockNumericIdentifier = bedrockEnchantment.ordinal();
      final var javaStringIdentifier = "minecraft:" + bedrockEnchantment.name().toLowerCase(Locale.ENGLISH);
      final var javaNumericIdentifier = Enchantment.JavaEnchantment.getByJavaIdentifier(javaStringIdentifier).ordinal();
      System.out.printf("%d,%s,%d\r\n", bedrockNumericIdentifier, javaStringIdentifier, javaNumericIdentifier);
    }
  }
}
