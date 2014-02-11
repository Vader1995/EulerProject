package net.jarydrester.euler;

import net.jarydrester.euler.activities.ProblemActivity;
import net.jarydrester.euler.activities.ProblemListActivity;
import net.jarydrester.euler.models.ModelModule;

import dagger.Module;

@Module(
        injects = {
                ProblemActivity.class,
                ProblemListActivity.class
        },
        includes = {
                ModelModule.class
        }
)
public class ApplicationModule {
}