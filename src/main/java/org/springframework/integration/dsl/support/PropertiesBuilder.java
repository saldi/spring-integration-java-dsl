/*
 * Copyright 2014 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.springframework.integration.dsl.support;

import java.util.Properties;


/**
 * @author Gary Russell
 * @author Artem Bilan
 *
 */
public class PropertiesBuilder {

	private final Properties properties = new Properties();

	public PropertiesBuilder put(Object key, Object value) {
		properties.put(key, value);
		return this;
	}

	public Properties get() {
		return this.properties;
	}

	public interface PropertiesConfigurer {

		void configure(PropertiesBuilder propertiesBuilder);

	}

}
