package com.fh.service;

import com.fh.entity.po.StudentBean;
import com.fh.util.PageBean;

public interface StudentService {
    PageBean<StudentBean> queryStudentList(PageBean<StudentBean> pageBean);

    void addStudent(StudentBean studentBean);

    StudentBean queryStudentById(Integer id);

    void updateStudentById(StudentBean studentBean);

    void updateStudentDelById(StudentBean studentBean);
}
