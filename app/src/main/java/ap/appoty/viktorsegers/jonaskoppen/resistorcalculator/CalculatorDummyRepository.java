package ap.appoty.viktorsegers.jonaskoppen.resistorcalculator;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Viktor on 13-12-2017.
 */

public class CalculatorDummyRepository implements ICalculatorRepository {

    private static ICalculatorRepository repo = null;

    public static ICalculatorRepository getInstance() {
        if (repo == null) {
            repo = new CalculatorDummyRepository() {

            };
        }
        return repo;
    }

    @Override
    public List<Calculator> getCalculator() {
        List<Calculator> calculators = new ArrayList<>();

        calculators.add(new Calculator("KleurCode", R.mipmap.ic_kleurcode));
        calculators.add(new Calculator("SerieSchakeling", R.mipmap.ic_serie));
        calculators.add(new Calculator("ParallelSchakeling", R.mipmap.ic_serie));

        return calculators;
    }
}

