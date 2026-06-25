package core.basesyntax.strategy;

import core.basesyntax.db.Storage;
import core.basesyntax.model.FruitTransaction;

public class BalanceOperation implements OperationHandler {

    @Override
    public void handle(FruitTransaction transaction) {
        Storage.fruits.put(
                transaction.getFruit(),
                Storage.fruits.getOrDefault(
                        transaction.getFruit(), 0)
                        + transaction.getQuantity()
        );
    }
}
