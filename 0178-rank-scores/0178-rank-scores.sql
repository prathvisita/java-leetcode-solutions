# Write your MySQL query statement below
WITH RankedScores AS (
    SELECT 
        id,
        score,
        DENSE_RANK() OVER (ORDER BY score Desc) AS `rank`
    FROM Scores
)
SELECT 
    score,
    `rank`
FROM RankedScores;
