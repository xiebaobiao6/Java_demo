import java.util.List;
import com.demo.controller.BaseController;
import com.demo.util.AnnotationUtil;
import com.demo.util.ClassUtil;
import com.fasterxml.jackson.core.JsonProcessingException;

public class Test {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException {
        // 获取特定包下所有的类(包括接口和类)
        List<Class<?>> clsList = ClassUtil.getAllClassByPackageName(BaseController.class.getPackage());
        //输出所有使用了特定注解的类的注解值
        try {
            AnnotationUtil.validAnnotation(clsList);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
    }

}
