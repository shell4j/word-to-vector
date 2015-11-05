# word-to-vector
word2vec Model
####python代码实现word2vec模型，并序列化到本地硬盘上
默认vector向量100维，10G数据训练3个小时

vector模型存入路径：
/home/yhuang/work/mymodel1104.txt（包括mention的模型）
/home/yhuang/work/mymodel1022.txt（不包括mention的vector模型）

####java代码将模型load，并计算相似度，可以在testModel类中修改模型的导入文件路径。
java -XX:-UseGCOverheadLimit -Xmx30G -jar test.jar /home/yhuang/work/mymodel1022.txt

(读入vect模型的文件目录，默认保存在服务器/home/yhuang/work/路径下)
