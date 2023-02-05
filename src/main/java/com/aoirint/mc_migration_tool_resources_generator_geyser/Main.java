package com.aoirint.mc_migration_tool_resources_generator_geyser;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.nio.charset.Charset;
import java.util.Locale;

import org.apache.commons.cli.DefaultParser;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.geysermc.geyser.inventory.item.Enchantment;

public class Main {
  static void dumpEnchantments(Writer sw) throws IOException {
    try (final var writer = new CSVPrinter(sw, CSVFormat.EXCEL)) {
      writer.printRecord("bedrock_numeric_identifier", "java_string_identifier", "java_numeric_identifier");

      for (final var bedrockEnchantment: Enchantment.values()) {
        final var bedrockNumericIdentifier = bedrockEnchantment.ordinal();
        final var javaStringIdentifier = "minecraft:" + bedrockEnchantment.name().toLowerCase(Locale.ENGLISH);
        final var javaNumericIdentifier = Enchantment.JavaEnchantment.getByJavaIdentifier(javaStringIdentifier).ordinal();
        writer.printRecord(bedrockNumericIdentifier, javaStringIdentifier, javaNumericIdentifier);
      }
    }
  }

  public static void main(String[] args) throws ParseException, FileNotFoundException, IOException {
    final var options = new Options();
    options.addOption(
      Option.builder("o")
        .argName("outputFile")
        .longOpt("output")
        .type(String.class)
        .hasArg()
        .desc("Output file")
        .build());

    final var parser = new DefaultParser();
    final var cmd = parser.parse(options, args);

    final var optionFile = new File(cmd.getOptionValue("o", "enchantments.csv"));
    dumpEnchantments(new FileWriter(optionFile, Charset.forName("utf-8")));
  }
}
