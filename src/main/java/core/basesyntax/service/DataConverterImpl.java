package core.basesyntax.service;

import core.basesyntax.model.FruitTransaction;
import java.util.ArrayList;
import java.util.List;

public class DataConverterImpl implements DataConverter {

    private static final String SEPARATOR = ",";

    @Override
    public List<FruitTransaction> convertToTransaction(List<String> data) {
        List<FruitTransaction> transactions = new ArrayList<>();

        for (int i = 1; i < data.size(); i++) {
            String[] parts = data.get(i).split(SEPARATOR);

            transactions.add(new FruitTransaction(
                    FruitTransaction.Operation.fromCode(parts[0]),
                    parts[1],
                    Integer.parseInt(parts[2])
            ));
        }

        return transactions;
    }
}
