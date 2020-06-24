package cn.com.sinosoft.app.pdf.bean;

import lombok.Builder;
import lombok.Data;

/**
 * @ClassName: TestFreemarkerBean
 * @Description:
 * @Version: v0.0.1
 * @Author: mubiao.wei
 * @Date: 2020/04/30 17:33
 */
@Data
@Builder
public class TestFreemarkerBean {
    public String name;
    public String password;
    public String age;
    public String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public TestFreemarkerBean(String name, String password, String age, String address) {
        this.name = name;
        this.password = password;
        this.age = age;
        this.address = address;
    }
}
