package com.prato.cloud.drools;

import com.prato.cloud.drools.rule.Rule;
import org.drools.compiler.compiler.DroolsParserException;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;

/**
 * @author Albert Ge
 * @version 1.2.0
 * @ClassName: RuleEngineImpl
 * @Description: 规则引擎接口实现类RuleEngine-Implements
 * @date 2016年5月26日
 */
public class RuleEngineImpl implements RuleEngine {
    private RuleBase ruleBase;

    @Override
    public void init() {
        /** Sets the system time format. */
        System.setProperty("drools.dateformat", "yyyy-MM-dd HH:mm:ss");
        /** Get the base factory. */
        ruleBase = SingleRuleFactory.getRuleBase();
        try {
            /** Get the rule files has bean read. */
            PackageBuilder backageBuilder = getPackageBuilderFile();
            /** Add the package to the 'RuleBase'. */
            ruleBase.addPackages(backageBuilder.getPackages());
        } catch (DroolsParserException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void refresh() {
        ruleBase = SingleRuleFactory.getRuleBase();
        Package[] packages = ruleBase.getPackages();
        for (Package items : packages) {
            ruleBase.removePackage(items.getName());
        }
        init();
    }

    @Override
    public void execute(Rule rule) {
        if (null == ruleBase.getPackages() || 0 == ruleBase.getPackages().length) {
            return;
        }

        StatefulSession statefulSession = ruleBase.newStatefulSession();
        statefulSession.insert(entityRule);
        statefulSession.fireAllRules(new org.drools.spi.AgendaFilter() {
            public boolean accept(Activation activation) {
                return !activation.getRule().getName().contains("_test");
            }
        });
        statefulSession.dispose();
    }

    /**
     * Read the rule files.
     *
     * @return
     * @throws Exception
     */
    private PackageBuilder getPackageBuild

    erFile() throws Exception {
/** Get the rule files. */
        List<String> drlFilePath = getRuleFile();
/** Sets the file to 'readers'. */
        List<Reader> readers = loadRuleFile(drlFilePath);
/** To create the 'backageBuilder'. */
        PackageBuilder backageBuilder = new PackageBuilder();
        for (Reader r : readers) {
            backageBuilder.addPackageFromDrl(r);
        }
/** Check if the script has a problem. */
        if (backageBuilder.hasErrors()) {
            throw new Exception(backageBuilder.

                    getErrors().toString());
        }
        return backageBuilder;
    }

    /**
     * Load the script files.
     *
     * @param drlFilePath
     * @return
     * @throws FileNotFoundException
     */
    private List<Reader> loadRuleFile(List

                                              <String> drlFilePath)
            throws FileNotFoundException {
        if (null == drlFilePath || 0 == drlFilePath.size()) {
            return null;
        }
        List<Reader> readers = new ArrayList<Reader>();
        for (String ruleFilePath : drlFilePath) {
            readers.add(new FileReader(new File(ruleFilePath)));
        }
        return readers;
    }

    /**
     * Get the rule files.
     *
     * @return
     */
    private List<String> getRuleFile() {
        List<String> drlFilePath = new ArrayList<String>();
        String path = "D:/utils/my/DroolsProject/src/ com/core/drools/drools_rule.drl";
        drlFilePath.add(path);
        return drlFilePath;
    }
}
