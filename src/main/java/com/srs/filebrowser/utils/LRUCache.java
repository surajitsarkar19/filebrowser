package com.srs.filebrowser.utils;

import java.util.HashMap;
class Entry<K,V> {
	V value;
	K key;
	Entry<K,V> left;
	Entry<K,V> right;
}
public class LRUCache<K,V> {

	HashMap<K, Entry<K,V>> hashmap;
	Entry<K,V> start, end;
	int LRU_SIZE;
	
	public LRUCache(int cacheSize) {
		hashmap = new HashMap<>();
		LRU_SIZE = cacheSize;
	}

	public V getEntry(K key) {
		if (hashmap.containsKey(key)) // Key Already Exist, just update the
		{
			Entry<K,V> entry = hashmap.get(key);
			removeNode(entry);
			addAtTop(entry);
			return entry.value;
		}
		return null;
	}

	public void putEntry(K key, V value) {
		if (hashmap.containsKey(key)) // Key Already Exist, just update the value and move it to top
		{
			Entry<K,V> entry = hashmap.get(key);
			entry.value = value;
			removeNode(entry);
			addAtTop(entry);
		} else {
			Entry<K,V> newnode = new Entry<>();
			newnode.left = null;
			newnode.right = null;
			newnode.value = value;
			newnode.key = key;
			if (hashmap.size() > LRU_SIZE) // We have reached maximum size so need to make room for new element.
			{
				hashmap.remove(end.key);
				removeNode(end);				
				addAtTop(newnode);

			} else {
				addAtTop(newnode);
			}

			hashmap.put(key, newnode);
		}
	}
	public void addAtTop(Entry<K,V> node) {
		node.right = start;
		node.left = null;
		if (start != null)
			start.left = node;
		start = node;
		if (end == null)
			end = start;
	}

	public void removeNode(Entry<K,V> node) {

		if (node.left != null) {
			node.left.right = node.right;
		} else {
			start = node.right;
		}

		if (node.right != null) {
			node.right.left = node.left;
		} else {
			end = node.left;
		}
	}
	public static void main(String[] args) throws java.lang.Exception {
		// your code goes here
		LRUCache<Integer,Integer> lrucache = new LRUCache<>(4);
		lrucache.putEntry(1, 1);
		lrucache.putEntry(10, 15);
		lrucache.putEntry(15, 10);
		lrucache.putEntry(10, 16);
		lrucache.putEntry(12, 15);
		lrucache.putEntry(18, 10);
		lrucache.putEntry(13, 16);

		System.out.println(lrucache.getEntry(1));
		System.out.println(lrucache.getEntry(10));
		System.out.println(lrucache.getEntry(15));

	}
}
