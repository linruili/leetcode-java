
public class z208ImplementTrie
{
	class TrieNode
	{
		TrieNode[] children = new TrieNode[26];
		boolean mark;
		char c;
		public TrieNode(){}
		public TrieNode(char c)
		{
			this.c = c;
		}
	}
	
	public class Trie
	{
		private TrieNode root;

	    /** Initialize your data structure here. */
	    public Trie() 
	    {
	        root = new TrieNode();
	    }
	    
	    /** Inserts a word into the trie. */
	    public void insert(String word) 
	    {
	    	TrieNode p = root;
	        for(int i=0; i<word.length(); ++i)
	        {
	        	char c = word.charAt(i);
	        	if(p.children[c-'a']==null)
	        		p.children[c-'a'] = new TrieNode(c);
	        	p = p.children[c-'a'];
	        }
	        p.mark = true;
	    }
	    
	    /** Returns if the word is in the trie. */
	    public boolean search(String word) 
	    {
	    	TrieNode p = root;
	        for(int i=0; i<word.length(); ++i)
	        {
	        	char c = word.charAt(i);
	        	if(p.children[c-'a']==null)
	        		return false;
	        	p = p.children[c-'a'];
	        }
	        return p.mark;
	    }
	    
	    /** Returns if there is any word in the trie that starts with the given prefix. */
	    public boolean startsWith(String prefix) 
	    {
	    	TrieNode p = root;
	        for(int i=0; i<prefix.length(); ++i)
	        {
	        	char c = prefix.charAt(i);
	        	p = p.children[c-'a'];
	        	if(p==null)
	        		return false;
	        }
	        return true;
	    }
	}
	public void run()
    {
    	Trie t = new Trie();
    	t.insert("a");
    	t.search("a");
    }

	public static void main(String[] args)
	{
		z208ImplementTrie s = new z208ImplementTrie();
		s.run();

	}

}
