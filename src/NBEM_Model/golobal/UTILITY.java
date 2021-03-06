package NBEM_Model.golobal;

import java.io.File;
import java.io.IOException;

/** 全局文件夹路径变量 */
public final class UTILITY {

	/** EM算法 将数据分为k类 */
	public final static int K = 100;
	/** Binning划分bins数目 */
	public final static int BINS = 100;
	/** 收敛误差 */
	public final static double ERROR = 0.001;

	/** 训练数据个数 */
	public static double TRAIN_DATA_COUNT = 0;

	/** 初始化训练数据个数 */
	public static void SET_FEATURE_VECTOR_TrainDataCount(int count) {
		UTILITY.TRAIN_DATA_COUNT = count;
	}

	/** 特征向量维数 D */
	public static int DIMENSION = 12;

	/** 初始化特征向量维数变量D */
	public static void SET_FEATURE_VECTOR_dimension(int count) {
		UTILITY.DIMENSION = count;
	}

	/** 健康磁盘静态数据 文件路径 */
	public final static String STATIC_HEALTH_PATH = "/home/pgxc/SMARTAnalyze/separateData/staticData/staticHealth.txt";

	/** 健康磁盘动态数据-训练数据 文件路径 */
	public final static String DYNAMIC_HEALTH_PATH = "/home/pgxc/SMARTAnalyze/separateData/dynamicData/dynamicHealth.txt";

	/** 故障磁盘静态数据 文件路径 */
	public final static String STATIC_FAILURE_PATH = "/home/pgxc/SMARTAnalyze/separateData/staticData/staticFailure.txt";

	/** 故障磁盘静动态数据 文件路径 */
	public final static String DYNAMIC_FAILURE_PATH = "/home/pgxc/SMARTAnalyze/separateData/dynamicData/dynamicFailure.txt";

	/** 特征向量 文件路径 */
	public final static String FEATURE_VECTOR_PATH = "/home/pgxc/SMARTAnalyze/featureVector/featureVector.txt";

	/** binning切分点 文件路径 */
	public final static String CUT_POINTS_PATH = "/home/pgxc/SMARTAnalyze/featureVector/cutPoints.txt";

	/** binning后特征向量 文件路径 */
	public final static String BINNED_FEATURE_VECTOR_PATH = "/home/pgxc/SMARTAnalyze/featureVector/binnedFeatureVector.txt";

	/** binning后特征向量 文件路径 */
	public final static String BINNED_TEST_FEATURE_VECTOR_PATH = "/home/pgxc/SMARTAnalyze/featureVector/OKTestSet.txt";

	/** Bayes似然函数likelihood 存储文件路径 */
	public final static String BAYES_POSTERIOR_PATH = "/home/pgxc/SMARTAnalyze/Bayes/posterior.txt";

	/** Bayes先验概率prior 存储文件路径 */
	public final static String BAYES_PRIOR_PATH = "/home/pgxc/SMARTAnalyze/Bayes/prior.txt";

	/** Bayes count(xi=v∧k) 三维数组[d][v][k] 存储文件路径 */
	public final static String BAYES_COUNT_Xd_V_K = "/home/pgxc/SMARTAnalyze/Bayes/countDVK.txt";

	/** Bayes count(k) 存储文件路径 */
	public final static String BAYES_COUNT_K = "/home/pgxc/SMARTAnalyze/Bayes/countK.txt";

	/** 测试集 存储文件路径 */
	public final static String TEST_SET_PATH = "/home/pgxc/SMARTAnalyze/testSet/testSet.txt";

	/** 未处理的原始测试数据 存储文件路径 */
	public final static String RAW_TEST_SET_PATH = "/home/pgxc/SMARTAnalyze/testSet/dynOKStateFailure.txt";
//	public final static String RAW_TEST_SET_PATH = "/home/pgxc/SMARTAnalyze/testSet/dynFailStateFailurePath.txt";

	/**
	 * 初始化文件 如果文件不存在，则创建该文件
	 * 
	 * @param path
	 *            文件目录
	 * @throws IOException
	 */
	public static void INIT_FILE(String path) throws IOException {
		File f = new File(path);
		File pf = f.getParentFile();
		if (!pf.exists()) {
			pf.mkdirs();
		}
		if (!f.exists()) {
			f.createNewFile();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
