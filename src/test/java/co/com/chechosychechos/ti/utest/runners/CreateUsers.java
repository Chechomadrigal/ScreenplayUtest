package co.com.chechosychechos.ti.utest.runners;
import io.cucumber.core.snippets.SnippetType;
import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features="src/test/resources/Features/create_users.feature",
        glue="co.com.chechosychechos.ti.utest.stepdefinitions",
        snippets= CucumberOptions.SnippetType.CAMELCASE
)
public class CreateUsers {
}
