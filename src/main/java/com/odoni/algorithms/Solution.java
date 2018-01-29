package com.odoni.algorithms;

import java.util.Arrays;

public class Solution {
	public static boolean isBalanced(String expression) {
		Stack openStack = new Stack();
		Stack closeStack = new Stack();
		String openChar = "{[(";
		String closeChar = "}])";
		char[] brackets = expression.toCharArray();
		for (int i = 0; i < brackets.length; i++) {
			char bracket = brackets[i];
			if (openChar.contains(String.valueOf(bracket))) {
				openStack.push(bracket);
			}
		}

		for (int i = brackets.length - 1; i >= 0; i--) {
			char bracket = brackets[i];
			if (closeChar.contains(String.valueOf(bracket))) {
				closeStack.push(bracket);
			}
		}

		while (!openStack.isEmpty() && !closeChar.isEmpty()) {
			char openBracket = openStack.pop();
			char closeBracket = closeStack.pop();
			if (openBracket == '{' && closeBracket != '}' ||
					openBracket == '[' && closeBracket != ']' ||
					openBracket == '(' && closeBracket != ')') {
				return false;
			}
		}

		return true;
	}

	public static void main(String[] args) {

		String[] arr = {"a", "b"};
		Arrays.sort(arr);

		String expression = "{()[][{}]}";
		System.out.println( (isBalanced(expression)) ? "YES" : "NO" );
	}

	static class Stack {
		private static class Node {
			private char data;
			private Node next;
			private Node(char data) {
				this.data = data;
			}
		}

		public Node top;

		public boolean isEmpty() {
			return top == null;
		}

		public char peek() {
			return top.data;
		}

		public void push(char data) {
			Node node = new Node(data);
			node.next = top;
			top = node;
		}

		public char pop() {
			char data = top.data;
			top = top.next;
			return data;
		}
	}
}
