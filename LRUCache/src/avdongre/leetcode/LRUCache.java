package avdongre.leetcode;

import java.util.HashMap;
import java.util.Map;

public class LRUCache {
	class Node {
		int key;
		int value;
		Node prev;
		Node next;
	}
	
	private int lruCapacity;
	private Map<Integer, Node> lruCache;
	private Node head;
	private Node tail;

	public LRUCache(int capacity) {
		this.lruCapacity = capacity;
		this.lruCache = new HashMap<Integer, Node>();
	}

	public int get(int key) {
		// Existing key
		if (this.lruCache.containsKey(key)) {
			// Move to first place
			Node node = this.lruCache.get(key);
			this.moveFirst(node);
			// Return the value
			return node.value;
		}
		// Not found
		return -1;
	}

	private void add(Node node) {
		// Reset position
		node.next = null;
		node.prev = null;
		// First element
		if (null == this.head) {
			this.head = node;
			this.tail = node;
			return;
		}
		// Existing element
		this.head.prev = node;
		node.next = this.head;
		this.head = node;
	}

	private void remove(Node node) {
		// Nothing to do
		if (this.head == null || null == node) {
			return;
		}
		// The only one item
		if (this.head == this.tail && this.head == node) {
			this.head = null;
			this.tail = null;
			return;
		}
		// Remove from head
		if (node == this.head) {
			this.head.next.prev = null;
			this.head = this.head.next;
			return;
		}
		// Remove from end
		if (node == this.tail) {
			this.tail.prev.next = null;
			this.tail = this.tail.prev;
			return;
		}
		// Remove in the middle
		node.prev.next = node.next;
		node.next.prev = node.prev;

	}

	private void removeLast() {
		this.remove(this.tail);
	}

	private void moveFirst(Node node) {
		this.remove(node);
		this.add(node);
	}

	public void set(int key, int value) {
		if (this.lruCache.containsKey(key)) {
			Node node = this.lruCache.get(key);
			this.moveFirst(node);
			node.value = value;
			return;
		}
		// Out of capacity, cleaning the oldest slot
		if (this.lruCache.size() >= this.lruCapacity) {
			int id = this.tail.key;
			this.removeLast();
			this.lruCache.remove(id);
		}

		// New slot
		Node node = new Node();
		node.key = key;
		node.value = value;
		this.add(node);
		this.lruCache.put(key, node);
	}

	public static void main(String[] args) {
		LRUCache lru = new LRUCache(5);
		for (int i = 0; i < 10; i++) {
			lru.set(i, i * 10);
		}
		System.out.println("");

	}
}
