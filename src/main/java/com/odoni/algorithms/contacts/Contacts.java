package com.odoni.algorithms.contacts;

import java.util.HashMap;

public class Contacts {

	private Trie trie;

	Contacts() {
		trie = new Trie();
	}

	public void insertContact(String name) {
		trie.add(name);
	}

	public int countContactsStartingWith(String textToFind) {
		return trie.find(textToFind);
	}


	class TrieNode {
		private HashMap<Character, TrieNode> children = new HashMap<>();
		public int size;

		public void putChildIfAbsent(char ch) {
			children.putIfAbsent(ch, new TrieNode());
		}

		public TrieNode getChild(char ch) {
			return children.get(ch);
		}
	}

	class Trie {
		TrieNode root = new TrieNode();

		Trie() {
		} // default constructor

		Trie(String[] words) {
			for (String word : words) {
				add(word);
			}
		}

		public void add(String str) {
			TrieNode curr = root;
			for (int i = 0; i < str.length(); i++) {
				Character ch = str.charAt(i);
				curr.putChildIfAbsent(ch);
				curr = curr.getChild(ch);
				curr.size++;
			}
		}

		public int find(String prefix) {
			TrieNode curr = root;

        /* Traverse down tree to end of our prefix */
			for (int i = 0; i < prefix.length(); i++) {
				Character ch = prefix.charAt(i);
				curr = curr.getChild(ch);
				if (curr == null) {
					return 0;
				}
			}
			return curr.size;
		}

	}

}
