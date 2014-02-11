package net.jarydrester.euler.models;

import net.jarydrester.euler.models.solutions.LargestPalindromeProject;
import net.jarydrester.euler.models.solutions.LargestPrimeFactor;
import net.jarydrester.euler.models.solutions.MultiplesOfThreeAndFive;
import net.jarydrester.euler.models.solutions.SumSquareDifference;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module(
        complete = false,
        library = true
)
public class ModelModule {
    @Provides
    @Singleton
    public List<Problem> provideProblems() {
        return new ArrayList<Problem>() {{
            add(new MultiplesOfThreeAndFive());
            add(new LargestPrimeFactor());
            add(new LargestPalindromeProject());
            add(new SumSquareDifference());
        }};
    }
}