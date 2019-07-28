package Tries;
import java.util.Set;


public class TrieTest {
    public static void main(String[] args) {
        System.out.println("creating new Trie");
        Trie trie = new Trie();
        
        System.out.println("inserting words");
        trie.insertWord("car");
        trie.insertWord("card");
        trie.insertWord("chip");
        trie.insertWord("trie");
        trie.insertWord("try");
        
        System.out.println("testing isPrefixValid method");
        trie.isPrefixValid("ch");
        
        System.out.println("testing isWordValid method");
        trie.isWordValid("trie");
        
        System.out.println("testing printAllKeys method");
        trie.printAllKeys(trie.root);
        
        System.out.println("Testing Complete");
        /* Set<Character> keys = trie.root.children.keySet();
        for(Character key : keys){
            System.out.println(keys);
        }  */
        
        /*Set<Character> keys = trie.root.children.get("c").children.keySet();
        for(Character key : keys){
            System.out.println(key);
        }*/
    }
}