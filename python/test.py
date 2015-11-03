'''
Created on Oct 14, 2015

@author: shell
'''
'''
class gensim.models.word2vec.Word2Vec(sentences=None, size=100, alpha=0.025, 
window=5, min_count=5, max_vocab_size=None, sample=0, seed=1, workers=1, 
min_alpha=0.0001, sg=1, hs=1, negative=0, cbow_mean=0, hashfxn=<built-in function hash>, iter=1, null_word=0, trim_rule=None)

如何测试gcc的编译器是否安装正确
from gensim.models import word2vec
word2vec.Word2Vec([['a','b']*10])
'''
import os
def readDir(rootDir):
    path=[]
    for lists in os.listdir(rootDir):
        path=os.path.join(lists)
    return path

from gensim import models
sentences=models.word2vec.Text8Corpus('/home/yhuang/work/out2')

#可能比较消耗内存
#sentences=models.word2vec.LineSentence('/home/yhuang/work/out2')
#models.word2vec.Word2Vec.estimate_memory(vocab_size=sentences)
model=models.Word2Vec(sentences,size=100, window=5, min_count=5, workers=10)
model.save("/home/yhuang/work/mymodel1022_full.txt")

####这种save方式只保存了数据的向量 没有树的信息
#model.save_word2vec_format("/home/yhuang/work/mymodel1022.txt", binary=False)
#model.load_word2vec_format("/home/yhuang/work/mymodel1022.txt",binary=False)
model1 = models.Word2Vec.load("/home/yhuang/work/myfullmodel1022.txt")
#model = models.Word2Vec.load_word2vec_

#format('mymodel.txt', binary=False)
s1="</entity/>political-philosophy";
s2="</entity/>social";
print(model.similarity(s1,s2))

