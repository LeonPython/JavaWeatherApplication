package xmlDOM;

import Bean.WeatherBean;
import Jframe.IShowWarning;

public interface iIDUQ {
	WeatherBean updateXML();//����ʱ�䣬bean�������º�ĵ�ǰʱ��
	WeatherBean deleteXML();//ɾ��ʱ�䣬bean����ɾ��ʱ�䣨ʱ��Ϊ�գ�
	WeatherBean insertXML();//���뵱ǰʱ��
	WeatherBean queryXML(String city,IShowWarning iw);//��ѯ��Ϣ��bean������ǰxml������
}
