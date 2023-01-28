import java.util.Locale;
import org.geysermc.geyser.inventory.item.Enchantment;

public class Main {
  public static void main(String[] argv) {
    System.out.printf("java_numeric_identifier,java_string_identifier,bedrock_numeric_identifier\n");
    for (final var bedrockEnchantment: Enchantment.values()) {
      final var bedrockNumericIdentifier = bedrockEnchantment.ordinal();
      final var javaStringIdentifier = "minecraft:" + bedrockEnchantment.name().toLowerCase(Locale.ENGLISH);
      final var javaNumericIdentifier = Enchantment.JavaEnchantment.getByJavaIdentifier(javaStringIdentifier).ordinal();
      System.out.printf("%d,%s,%d\n", javaNumericIdentifier, javaStringIdentifier, bedrockNumericIdentifier);
    }
  }
}