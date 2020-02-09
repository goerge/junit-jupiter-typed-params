package com.codementor.junit.typedparams;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.assertj.core.api.Assertions.assertThat;

public class TypedArgumentTest {

		@SuppressWarnings("unused")
		static Stream<TypedArguments2<Integer, Boolean>> arguments() {
				return Stream.of(
						TypedArguments.create(17, false),
						TypedArguments.create(22, true)
				);
		}

		@ParameterizedTest
		@MethodSource("arguments")
		void personIsAdultWithArguments(final int age, final boolean isAdult) {
				assertThat(new Person(age).isAdult()).isEqualTo(isAdult);
		}

		class Person {
				private final int age;

				Person(final int age) {
						this.age = age;
				}

				boolean isAdult() {
						return age > 18;
				}
		}
}
