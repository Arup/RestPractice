package com.lucene;

import org.apache.lucene.analysis.Analyzer;
import org.apache.lucene.analysis.core.WhitespaceAnalyzer;
import org.apache.lucene.index.IndexWriter;
import org.apache.lucene.index.IndexWriterConfig;
import org.apache.lucene.store.Directory;
import org.apache.lucene.store.RAMDirectory;

import java.io.IOException;

public class IndexW {
    public IndexWriter IndexW() {

        IndexWriter indexWriter = null;
        try {
            Analyzer analyzer = new WhitespaceAnalyzer();
            Directory directory= new RAMDirectory();
            IndexWriterConfig config = new IndexWriterConfig(analyzer);
            indexWriter = new IndexWriter(directory,config);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return indexWriter;
    }
}
