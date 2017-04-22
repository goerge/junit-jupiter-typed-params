package com.codementor.junit.typedparams;

import org.junit.jupiter.params.provider.Arguments;

public class TypedArguments implements Arguments {

		public static <A1> TypedArguments1<A1> create(final A1 a1) {
				return new TypedArguments1<>(a1);
		}

		public static <A1, A2> TypedArguments2<A1, A2> create(final A1 a1, final A2 a2) {
				return new TypedArguments2<>(a1, a2);
		}

		public static <A1, A2, A3> TypedArguments3<A1, A2, A3> create(final A1 a1, final A2 a2, final A3 a3) {
				return new TypedArguments3<>(a1, a2, a3);
		}

		public static <A1, A2, A3, A4> TypedArguments4<A1, A2, A3, A4> create(final A1 a1, final A2 a2, final A3 a3, final A4 a4) {
				return new TypedArguments4<>(a1, a2, a3, a4);
		}

		public static <A1, A2, A3, A4, A5> TypedArguments5<A1, A2, A3, A4, A5> create(final A1 a1, final A2 a2, final A3 a3, final A4 a4,
																																									final A5 a5) {
				return new TypedArguments5<>(a1, a2, a3, a4, a5);
		}

		public static <A1, A2, A3, A4, A5, A6> TypedArguments6<A1, A2, A3, A4, A5, A6> create(final A1 a1, final A2 a2, final A3 a3,
																																													final A4 a4, final A5 a5, final A6 a6) {
				return new TypedArguments6<>(a1, a2, a3, a4, a5, a6);
		}

		public static <A1, A2, A3, A4, A5, A6, A7> TypedArguments7<A1, A2, A3, A4, A5, A6, A7> create(final A1 a1, final A2 a2, final A3 a3,
																																																	final A4 a4, final A5 a5, final A6 a6,
																																																	final A7 a7) {
				return new TypedArguments7<>(a1, a2, a3, a4, a5, a6, a7);
		}

		public static <A1, A2, A3, A4, A5, A6, A7, A8> TypedArguments8<A1, A2, A3, A4, A5, A6, A7, A8> create(final A1 a1, final A2 a2,
																																																					final A3 a3, final A4 a4,
																																																					final A5 a5, final A6 a6,
																																																					final A7 a7, final A8 a8) {
				return new TypedArguments8<>(a1, a2, a3, a4, a5, a6, a7, a8);
		}

		private final Object[] arguments;

		protected TypedArguments(final Object... arguments) {
				this.arguments = arguments;
		}

		@Override
		public Object[] get() {
				return arguments;
		}
}
