package core.basesyntax.strategy;

import core.basesyntax.db.Storage;
import core.basesyntax.model.FruitTransaction;

public class PurchaseOperation implements OperationHandler {

    @Override
    public void handle(FruitTransaction transaction) {
        Storage.fruits.put(
                transaction.getFruit(),
                Storage.fruits.get(transaction.getFruit())
                        - transaction.getQuantity()
        );
    }
}
