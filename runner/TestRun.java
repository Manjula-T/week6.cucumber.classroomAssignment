package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features= "src/test/java/features",
					glue="steps",
					monochrome=true,
					publish =true,
					tags= "@smoke and @sanity")

					//dryRun=true,
					//snippets=SnippetType.CAMELCASE
					
public class TestRun extends AbstractTestNGCucumberTests {

}
