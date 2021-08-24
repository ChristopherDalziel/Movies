package to.dev.example.modules

import dev.misfitlabs.kotlinguice4.KotlinModule
import org.glassfish.jersey.client.JerseyClientBuilder
import javax.ws.rs.client.Client

class DefaultModule: KotlinModule() {
    override fun configure() {
        bind<Client>().toInstance(JerseyClientBuilder.createClient())
    }
}