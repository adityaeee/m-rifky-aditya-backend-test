SELECT
     p.id_murid AS id_murid,
     m.name AS name,
     p.status AS pendidikan_terkahir,
     m.time_create AS time_create,
     MAX(p.time_create) AS time_update
FROM
     pendidikan p
JOIN
     murid m ON p.id_murid = m.id
GROUP BY
     p.id_murid;
