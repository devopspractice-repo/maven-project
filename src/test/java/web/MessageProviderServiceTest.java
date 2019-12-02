/*
 * Copyright 2013 ${company}.
 */
package web;

import javax.inject.Inject;

import static org.assertj.core.api.Assertions.assertThat;
import org.atteo.moonshine.Moonshine;
import org.atteo.moonshine.tests.MoonshineConfiguration;
import org.atteo.moonshine.tests.MoonshineTest;
import org.junit.Test;

@MoonshineConfiguration(autoConfiguration = true)
public class MessageProviderServiceTest extends MoonshineTest {
	@Inject
	private MessageProvider provider;

	@Test
	public void shouldReturnSpecifiedMessage() {
		assertThat(provider.getMessage()).isEqualTo("Hello World!");
	}
}
