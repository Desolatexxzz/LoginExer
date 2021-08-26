package service;

import dao.Manger;
import dao.MangerDao;
import dao.MangerDaoImpl;

public class MangerServiceImpl implements MangerService{
    @Override
    public boolean login(Manger manger) {
        MangerDao mangerDao = new MangerDaoImpl();
        return mangerDao.login(manger);
    }
}
