'''
Created on Oct 18, 2015

@author: shell
'''
from gensim import models
#from gensim.test.test_doc2vec import sentences
def readFile(s):
    return models.word2vec.Text8Corpus(s)

def buildModel(sentences):
    return models.Word2Vec(sentences,size=100, window=5, min_count=0, workers=4)

def loadModel(s):
    return models.Word2Vec.load(s);

def getSimilarity(s,s1,s2):
    m=loadModel(s)
    return m.similarity(s1, s2)
    