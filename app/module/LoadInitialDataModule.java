package module;

import com.google.inject.AbstractModule;

public class LoadInitialDataModule extends AbstractModule {

	@Override
	protected void configure() {
		bind(InitialData.class).asEagerSingleton();
	}
}
