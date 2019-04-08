package mo.controller.admin;

import mo.core.Result;

public interface AdminContestController {

    /**
     * 查询竞赛集合
     *
     * @param page     页码
     * @param per_page 每页数量
     * @return 竞赛集合
     */
    Result contest(String page, String per_page);

    /**
     * 将题目添加至比赛
     *
     * @param problem_id 题目Id
     * @param contest_id 竞赛Id
     * @return 操作结果
     */
    Result addProblem(String problem_id, String contest_id);

    /**
     * 从比赛中删除指定竞赛
     *
     * @param problem_id 题目Id
     * @param contest_id 竞赛Id
     * @return 操作结果
     */
    Result deleteProblem(String problem_id, String contest_id);
}