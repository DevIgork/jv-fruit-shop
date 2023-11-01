package core.basesyntax.strategy;

import core.basesyntax.Dao.FruitDao;
import core.basesyntax.Dao.FruitDaoImp;
import core.basesyntax.model.FruitTransaction;

public class PurchaseOperationHandler implements OperationHandler {
    private FruitDao dataBase;

    public PurchaseOperationHandler() {
        this.dataBase = new FruitDaoImp();
    }

    @Override
    public boolean DoOperation(FruitTransaction fruit) {
        String fruitName = fruit.getFruit();
        int fruitQuantity = fruit.getQuantity();
        dataBase.getStorage().put(fruitName, dataBase.get(fruitName) - fruitQuantity);
        return true;
    }
}
