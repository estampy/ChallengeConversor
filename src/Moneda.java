import java.util.List;

public record Moneda(String result,
                     String base_code,
                     List<String> conversion_rates) {
}
