insert into article(title, content, hashtag, created_by, modified_by, created_at, modified_at) values
('java', 'what is difference with version 17 and 11?', '#java', 'faker', 'faker', '2021-05-23 08:34:54', '2021-05-23 08:35:54'),
('red', 'you and i go hard at each other like we going to war.', '#java', 'code', 'blame', '2022-05-23 08:34:54', '2022-05-23 08:35:54'),
('git', 'i cannot tell you what it really is.', '#sing', 'faster', 'github', '2023-05-23 08:34:54', '2023-05-23 08:35:54'),
('fast', 'try to tell you no', '#sing', 'project', 'online', '2023-05-25 08:34:54', '2023-06-23 08:35:54'),
('ppp', 'my mind keep saying run as fast as you can', '#sing', 'lecture', 'school', '2021-05-23 08:34:54', '2024-05-23 08:35:54'),
('note', 'samsung note book galaxy cool', '#main', 'car', 'terry', '2021-05-23 08:34:54', '2021-05-28 08:35:54'),
('book', 'kyobo book market aladin yes24', '#main', 'alex', 'john', '2020-05-23 08:34:54', '2021-05-23 08:35:54'),
('table', 'furniture how are you cafe', '#main', 'james', 'alex', '2020-05-23 08:34:54', '2022-05-23 08:35:54'),
('chair', 'chair shot wwe champion', '#test', 'alex', 'alex', '2021-08-23 08:34:54', '2021-10-23 08:35:54'),
('travel', 'japan america england china korea vietnam', '#trip', 'faker', 'faker', '2021-05-23 08:34:54', '2021-05-23 08:40:54'),
('soccer', 'messi ronaldo very nice player in the world soccer', '#soccer', 'salah', 'salah', '2021-05-23 08:34:54', '2021-05-24 08:35:54');

insert into article_comment(article_id, content, created_at, modified_at, created_by, modified_by) values
(1, 'this is content', '2023-12-12 08:34:23', '2023-12-12 08:34:23', 'amen', 'amen'),
(1, 'study hate', '2023-12-12 08:34:23', '2023-12-12 08:34:23', 'bmen', 'bmen'),
(1, 'hello mr ms', '2023-12-12 08:34:23', '2023-12-12 08:34:23', 'cmen', 'cmen'),
(2, 'client server', '2023-12-12 08:34:23', '2023-12-12 08:34:23', 'amen', 'amen'),
(2, 'tcp socket udp', '2023-12-12 08:34:23', '2023-12-12 08:34:23', 'amen', 'amen'),
(3, 'layer many much a lot', '2023-12-12 08:34:23', '2023-12-12 08:34:23', 'amen', 'amen'),
(4, 'data path application', '2023-12-12 08:34:23', '2023-12-12 08:34:23', 'amen', 'amen'),
(5, 'why so sirius', '2023-12-12 08:34:23', '2023-12-12 08:34:23', 'amen', 'amen'),
(5, 'papago google alphago', '2023-12-12 08:34:23', '2023-12-12 08:34:23', 'amen', 'amen'),
(5, 'naver never ever', '2023-12-12 08:34:23', '2023-12-12 08:34:23', 'amen', 'amen'),
(5, 'samsung lg sk hanhwa hyundai', '2023-12-12 08:34:23', '2023-12-12 08:34:23', 'amen', 'amen');

insert into user_account(user_id, user_password, nickname, email, memo, created_at, created_by, modified_at, modified_by)
values ('t1', '1234', 'T1', 't1@mail.com', 'im t1', now(), 't1', now(), 't1');